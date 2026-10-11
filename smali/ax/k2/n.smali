.class public final synthetic Lax/k2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lax/k2/o;


# direct methods
.method public synthetic constructor <init>(Lax/k2/o;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/k2/n;->q:Lax/k2/o;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/k2/n;->q:Lax/k2/o;

    invoke-virtual {v0}, Lax/k2/o;->k()V

    return-void
.end method
