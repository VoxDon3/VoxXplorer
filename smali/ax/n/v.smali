.class public final synthetic Lax/n/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackInvokedCallback;


# instance fields
.field public final synthetic a:Lax/n/h;


# direct methods
.method public synthetic constructor <init>(Lax/n/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/n/v;->a:Lax/n/h;

    return-void
.end method


# virtual methods
.method public final onBackInvoked()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/n/v;->a:Lax/n/h;

    invoke-virtual {v0}, Lax/n/h;->G0()Z

    return-void
.end method
