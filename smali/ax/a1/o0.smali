.class public final synthetic Lax/a1/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/AudioRouting$OnRoutingChangedListener;


# instance fields
.field public final synthetic a:Lax/a1/f0$l;


# direct methods
.method public synthetic constructor <init>(Lax/a1/f0$l;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/a1/o0;->a:Lax/a1/f0$l;

    return-void
.end method


# virtual methods
.method public final onRoutingChanged(Landroid/media/AudioRouting;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/o0;->a:Lax/a1/f0$l;

    invoke-static {v0, p1}, Lax/a1/f0$l;->a(Lax/a1/f0$l;Landroid/media/AudioRouting;)V

    return-void
.end method
