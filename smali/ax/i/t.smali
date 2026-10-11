.class public final synthetic Lax/i/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackInvokedCallback;


# instance fields
.field public final synthetic a:Lax/Fb/a;


# direct methods
.method public synthetic constructor <init>(Lax/Fb/a;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/i/t;->a:Lax/Fb/a;

    return-void
.end method


# virtual methods
.method public final onBackInvoked()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i/t;->a:Lax/Fb/a;

    invoke-static {v0}, Landroidx/activity/OnBackPressedDispatcher$f;->a(Lax/Fb/a;)V

    return-void
.end method
